/*
*RegExp对象
*       1、创建
*           1、var reg=new RegExp("正则表达式");
*           2、var reg=/正则表达式/;
*       2、方法
*           1、test(参数)：验证指定字符串是否符合正则定义的规范
* */

//创建方法1
var reg= new RegExp("\\w(6,12)");
//创建方法2
var reg2=/^\w(6,12)$/;

alert(reg);
alert(reg2);

//验证
var username="张三"
var flag = reg2.test(username);
alert(flag);
