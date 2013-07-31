LiquibaseWorkshop
=================

Requirements
------------
* PostgreSQL installed on localhost

Setup
-----
1. Add the following lines to pg_hba.conf (which is located in C:\Program Files\PostgreSQL\9.2\data on Windows)

        host	 all	 		antani	 		127.0.0.1/32	 		password
        host	 all	 		antani	 		::1/128			 		password
2. Create user 'antani' and database 'LiquibaseWorkshop' on psql console

        CREATE USER antani WITH PASSWORD 'antani';
        CREATE DATABASE LiquibaseWorkshop;
        GRANT ALL PRIVILEGES ON DATABASE LiquibaseWorkshop to antani;

Maven usage
-----------

* Schema updating

```
mvn -e compile liquibase:update
```

This command will update the current db schema according to src/main/db/changelogs.xml content.

* Creating a changeset

```
mvn -e compile liquibase:diff
```

This command will do a diff from current hibernate schema to the local PostgreSQL and will generate a new changeset in src/main/db folder.


References
==========

Liquibase Hibernate integration
-------------------------------
http://www.liquibase.org/documentation/hibernate.html

Source

https://github.com/terrancesnyder/liquibase-hibernate
