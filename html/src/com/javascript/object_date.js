/*
*Date：日期对象
*   1、创建
*       var date = new Date();
*   2、方法
*       toLocaleString()：返回当前date对象对应的时间本地字符串格式
* */

var date = new Date();
document.write(date + "<br>");

document.write(date.toLocaleString() + "<br>");
document.write(date.getTimezoneOffset()+ "<br>" );