create table Guest
(
    guestId        varchar(100)             not null
        primary key,
    guestFirstName varchar(100)             not null,
    guestLastName  varchar(100)             not null,
    guestAddress   varchar(100)             not null,
    passportNumber varchar(100)             not null,
    guestCountry   varchar(100)             not null,
    guestContact   varchar(15)              not null
);

create table RoomType
(
    typeId    varchar(20)
        primary key,
    typeName  varchar(100)  not null,
    typePrice decimal(10, 2) not null
);

create table Room
(
    roomNumber varchar(20) not null
        primary key,
    typeId     varchar(20)         not null,
    roomPrice  decimal(10, 2)      not null,
    roomStatus varchar(50) not null,
    constraint Room_RoomType_typeId_fk
        foreign key (typeId) references RoomType (typeId)
);

create table Package
(
   packId   varchar(20)     not null
        primary key,
   packName varchar(30)     not null,
   packPrice decimal(10,2)  not null
);

create table Reservation
(
    resvId       varchar(20)                    not null
        primary key,
    guestId      varchar(50)                    not null
        primary key,
    roomNumber   varchar(10)                    not null
        primary key,
    packId      varchar(20)                     not null
        primary key,
    roomPrice   decimal(10,2)                   not null,
    packPrice   decimal(10,2)                   not null,
    resvDate    date                            not null,
    checkInDate  date                           not null,
    checkOutDate date                           not null,
    noOfDays     (checkOutDate-checkInDate)     not null,
    price        (noOfDays*(roomPrice+packPrice)) not null,
    constraint Reservation_FK
        foreign key (guestId) references Guest (guestId),
    constraint Reservation_FK_1
        foreign key (roomNumber) references Room (roomNumber),
     constraint Reservation_FK_2
        foreign key (packId) references Package (packId) 
);

create table User
(
    userId    varchar(50)  not null
        primary key,
    firstName varchar(100) not null,
    email     varchar(100) not null,
    userRole  varchar(50)  not null,
    userName  varchar(100) not null,
    password  varchar(100) not null
);


Insert Into User Values ('U001','admin','admin@yahoo.com','admin','admin','admin123');

Insert Into Package Values
('P001','Bed & Breakfast Single',4000.00),
('P002','Half-Board Single',9000.00),
('P003','Full-Board Single',15000.00),
('P004','Bed & Breakfast Double',8000.00),
('P005','Half-Board Double',18000.00),
('P006','Full-Board Double',30000.00),
('P007','Bed & Breakfast Triple',12000.00),
('P008','Half-Board Triple',27000.00),
('P009','Full-Board Triple',45000.00);
