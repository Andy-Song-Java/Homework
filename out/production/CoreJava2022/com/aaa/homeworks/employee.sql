create table employee(
    id number(3) primary key,
    name varchar2(30) not null,
    salary number(7),
    birthday date
);

create sequence employee_seq

create or replace procedure save_emp
    (name in varchar2,
    salary in number,
    birthday in date,
    result out number)
is
    begin
    insert into employee values (employee_seq.nextval, name, salary, birthday);
result := -1;
