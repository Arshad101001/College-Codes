const mysql = require('mysql2');
const connection = mysql.createConnection(
    {
        host: 'localhost',
        user: 'system',
        password: 'tiger',
        database: 'testdb',
    }
)

connection.connect((err) => {
    if (err) {
        console.log('Error connecting to the database', err.message);
        return;
    }
    console.log('Connected to MySql database');
    // 1. create table 
    const createTableQuery = `create table if not exists user(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100))`
    connection.query(createTableQuery, (err, result) => {
        if (err) {
            console.log('Error while creating table : ', err.message);
            return;
        }
        console.log('Table created successfully');

        // inserting data into table
        const insertQuery = `insert into user(name, email) values?`;
        const values = [
            ['Alice', 'alice@example.com'],
            ['Bob', 'bob@example.com']
        ];

        connection.query(insertQuery, [values], (err, result) => {
            if (err) {
                console.log('Error while inserting into table : ', err.message);
                return;
            }
            console.log(`${result.affectedRows} rows inserted into table`);
        })

        // selecting data from table

        const selectQuery = `select * from user`;

        connection.query(selectQuery, (err, result) => {
            if (err) {
                console.log('Error while selecting data from table : ', err.message);
                return;
            }
            console.log(`Selecting data from table is : `, result);
        })

        // updating data from table

        const updateQuery = `update user set email = 'alice@gmail.com' where name = 'alice'`;

        connection.query(updateQuery, (err, result) => {
            if (err) {
                console.log('Error while updating data from table : ', err.message);
                return;
            }
            console.log(`Selecting data from table is : `, result);
        })

        // selecting data from table

        const select1Query = `select * from user`;

        connection.query(select1Query, (err, result) => {
            if (err) {
                console.log('Error while selecting data from table : ', err.message);
                return;
            }
            console.log(`Selecting data from table is : `, result);
        })

        // alter table

        const alterQuery = `alter table user add phone int`;

        connection.query(alterQuery, (err, result) => {
            if (err) {
                console.log('Error while altering data in table : ', err.message);
                return;
            }
            // console.log(`Selecting data from table is : `, result);
        })

        // selecting data from table

        const select2Query = `select * from user`;

        connection.query(select2Query, (err, result) => {
            if (err) {
                console.log('Error while selecting data from table : ', err.message);
                return;
            }
            console.log(`Selecting data from table is : `, result);
        })

        // delete from table

        // const deleteQuery = `delete from user where name = 'bob'`;

        // connection.query(deleteQuery, (err, result) => {
        //     if (err) {
        //         console.log('Error while deleting data from table : ', err.message);
        //         return;
        //     }
        //     console.log(`Delete from table : `, result);
        // })

        // table drop

        // const dropQuery = `drop table user`;

        // connection.query(dropQuery, (err, result) => {
        //     if (err) {
        //         console.log('Error while droping the table : ', err.message);
        //         return;
        //     }
        //     console.log(` droping table : `, result);
        // })
    })

})