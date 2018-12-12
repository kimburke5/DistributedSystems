DROP DATABASE BookingService;
CREATE DATABASE BookingService;
USE BookingService;

drop table if exists CustOrder;
create table CustOrder(
   OrderID int,
   Date date,
   CarID varchar(50),
   CustID varchar(50),
   primary key (OrderID)
);

drop table if exists Accounts;
create table Accounts (
    acc_no int,
    first_name varchar(50),
    surname varchar(50),
    primary key(acc_no)
);

drop table if exists Cars;
create table Cars (
   OrderID int,
   car_make varchar(50),
   car_model varchar(50),
   primary key (OrderID)
);

drop table if exists Booking;
create table Booking (
    booking_id int NOT NULL AUTO_INCREMENT,
	OrderID int,
    acc_no int,
    rental_date Date,
    return_date Date,
    primary key(booking_id),
    foreign key(acc_no) references Accounts(acc_no),
    foreign key(OrderID) references CustOrder(OrderID)
);
insert into CustOrder (Date, CustID, CarID) values (curdate(),1,1),(curdate(),2,2),(curdate(),3,3);
insert into Accounts values(3000, 'John', 'Murphy');
insert into Accounts values(4000, 'Mark', 'Stuart');
insert into Accounts values(5000, 'Mark', 'Stuart');
insert into Cars values(2017,'Honda', 'Civic');
insert into Cars values(2018,'Lexus', 'IS200');
insert into Cars values(2019,'Toyota', 'Corolla');
insert into Booking values(300, 400, 3000, '2018-12-01','2019-01-10');
insert into Booking values(400, 500, 4000, '2018-11-01','2019-01-15');
insert into Booking values(600, 700, 5000, '2018-10-01','2019-01-20');