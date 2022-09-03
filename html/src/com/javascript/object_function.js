/*
*对象
* */

/*
*Function：函数（方法）对象
*   1、创建
*       1、var fun =new Function(形式参数列表,方法体)  //忘掉吧！
*       2、function 方法名称(形式参数列表){
*                   方法体
*             }
*        3、var 方法名 =function(){
*                   方法体
*             }
*   2、方法
*
*   3、属性
*       1、length function形参个数
*   4、特点
*       1、方法定义时，形参的类型不用写
*       2、方法是一个对象，如果定义名称相同的方法，会覆盖
*       3、*在JS中，方法的调用只与方法的名称有关，和参数列表无关*
*      4、在方法声明中有一个隐藏的内置对象（数组），arguments，封装所有的实际参数
*   5、调用
*       1、方法名称（实际参数列表）
*
* */

//1、创建方式1
var fun1 = new Function("a", "b", "alert(a)");

//调用方法
fun1(3, 4);

//2、创建方式2
function fun2(a, b) {
    alert(a + b);
}

//调用方法
fun2(3, 4);

//3、创建方式3
var fun3 = function (a, b) {
    alert(a - b);
}

//调用方法
fun3(3, 4);

//4、求两个数之和
function fun4(a, b) {
    return a + b;
}

//调用方法
var sum = fun4(3, 4);
alert(sum);

//5、求任意个数的和
function add() {
    /* alert(arguments[0]);
     alert(arguments[1]);*/
    sum = 0;
    for (var i = 0; i < arguments.length; i++) {
        sum += arguments[i];
    }
    return sum;
}

//调用方法
var sum1 = add(1, 2, 3, 4);
alert(sum1);