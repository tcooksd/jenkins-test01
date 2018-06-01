var express = require('express');
var router = express.Router();
var mysql = require('mysql');
var database = process.env.MYSQL_IP;
var databaseport = process.env.MYSQL_PORT;
var hostname = process.env.HOSTNAME;

var con = mysql.createConnection({
  host: database,
  port: databaseport,
  database: "nodedemo",
  user: "root",
  password: "password!"
});

con.connect(function(err) {
  if (err) throw err;
  con.query("SELECT * FROM person", function (err, result, fields) {
    if (err) throw err;
    console.log(result);
  });
});

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'NodeJS Demo',
  database: database,
  port: databaseport,
  hostname: hostname,});
});
module.exports = router;
