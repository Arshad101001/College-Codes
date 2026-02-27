-- ORDBMS

-- creating object
create type name  as object(FName varchar(15), LName varchar(15));
/

-- creating table with object
create table Person(PName Name);

-- inserting into table
insert into Person values(Name('George', 'Mishra'));

-- displaying table
select * from Person;

-- describe table
desc Person;

-- displaying specific column
select p.PName.FName from Person p;           -- p is a alias it can be anything
select p.PName.FName, p.PName.LName from Person p;


-- creating another object type 'Adress' with attributes 'street' and 'city' of a person using the table 'People'.
-- Also display the Person 'Name' and 'DOB' using 'Name' and 'Date' Object type.

create type Address as object(Street varchar(10), City varchar(10));
/

-- creating table with object types
create table People(PLName Name, Addr Address, DOB Date);

-- inserting values
insert into People Values(Name('Bob', 'Sharma'), Address('New city', 'mumbai'), to_date('03-06-1998', 'dd-mm-yyyy'));

-- describing table
desc People;

-- displaying FName and LName
select p.PLName.FName, p.PLName.LName from People p;

-- displaying street and city
select p.Addr.street, p.Addr.city from People p;



-- Calculating square of a number using type.
-- 1. create type
create type Demo as object(ID number, member function get_square return number);
/

-- 2. define function body
create or replace type body Demo is
  member function get_square return number is                                               -- define member function
  begin                                                                                     -- function logic
  return ID * ID;                                                                           -- return square of ID
  end;
  end;
  /


 -- 3. creating table
create table demo_tbl(col Demo);

-- 4. inserting values in table
insert into demo_tbl values(Demo(4));

-- 5. display square of a number
select p.col.get_square() from demo_tbl p;