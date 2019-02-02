create table meal
(
   id integer not null,
   name varchar(255) not null,
   mealType varchar(255) not null,
   ingredients text not null,
   instructions text null,
   primary key(id)
);
