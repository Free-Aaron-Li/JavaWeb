/*
*Global对象
*   1、特点：全局对象，这个Global中封装的方法不需要对象就可以直接调用。方法名();
*   2、方法：
*       1、encodeURL()：url编码
*       2、decodeURL()：url解码
*
*       3、encodeURLComponent()：url编码，比起上面两个编码的字符更多
*       4、decodeURLComponent()：url解码
*
*       6、parseInt()：将字符串转为数字
*             逐一判断每一个字符是否是数字，直到不是数字为止，将前面数字部分转为number
*       7、isNaN()：判断一个值是否是NaN
*             MaN六亲不认，连自己都不认，NaN参与比较，全为false
*       8、eval()：将JavaScript字符串，转换成脚本执行
*   3、URL编码
*       张三 --> %E5%BC%A0%E4%B8%89
*        gbk编码 一个汉字占2个字节
*        utf-8编码  一个汉字占3个字节
*        一个字节8个二进制位
* */

var str = "http://www.baidu.com?wd=张三在飞翔";

//编码
var encode = encodeURI(str);
document.write(encode + "<br>"); //http://www.baidu.com?wd=%E5%BC%A0%E4%B8%89%E5%9C%A8%E9%A3%9E%E7%BF%94

//解码
var result = decodeURI(encode);
document.write(result + "<br>");


//编码
var encode2 = encodeURIComponent(str);
document.write(encode2 + "<br>"); //http%3A%2F%2Fwww.baidu.com%3Fwd%3D%E5%BC%A0%E4%B8%89%E5%9C%A8%E9%A3%9E%E7%BF%94

//解码
var result2 = decodeURIComponent(encode);
document.write(result2 + "<br>");

var str2 = "123abc";
var number = parseInt(str2);
alert(number);

//NaN判断

var str3 = "NaN";
document.write(isNaN(str3) ? "NaN" : str3);

//转脚本
var str4 = "alert(123)";
eval(str4);