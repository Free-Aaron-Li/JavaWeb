/*
*Array：数组对象
*   1、创建
*       1、var arr = new Array(元素列表);
*       2、var arr = new Array(默认长度);
*       3、var arr = [元素列表];
*   2、方法
*       1、join(参数)：将数组中的元素按照指定的分隔符（传入的参数）拼接为字符串
*       2、push(参数)：向数组的末尾添加一个或更多元素，并返回新的长度
*
*   3、属性
*       1、Length 数组长度
*
*   4、特点
*       1、JS中，数组元素类型可变的
*       2、JS中，数组长度可变的
* */

//1、创建方式1
var arr = new Array(1, 2, 3, 4);

//2、创建方式2
var arr2 = new Array(5);

//3、创建方式3
var arr3 = [1, 2, 3, 4];

//打印
document.write(arr + "<br>");
document.write(arr2 + "<br>");
document.write(arr3 + "<br>");

//数组元素类型可变
var arr4 = [1, "no", true];
document.write(arr4 + "<br>");

//join方法
document.write(arr4.join("--") + "<br>");

//push方法
arr4.push("haha");
document.write(arr4.join("--") + "<br>");
