/*
*Date：日期对象
*   1、创建
*       var date = new Date();
*   2、方法
*       toLocaleString()：返回当前date对象对应的时间本地字符串格式
*       getTime()：获取毫秒值。返回当前如期对象描述的时间到1970年1月1日零点毫秒值差
* */

var date = new Date();
document.write(date + "<br>");

document.write(date.toLocaleString() + "<br>");
document.write(date.getTimezoneOffset()+ "<br>" );
document.write(date.getTime() + "<br>");