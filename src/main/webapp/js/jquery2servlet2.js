/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function sendWorkerInfo()
{
    var data_api = window.location.origin + "/JEEL219/s4du";
    console.log("sending worker info");
    var data2send = $('form').serializeArray();
    console.log(data2send);
    $.post(data_api,data2send, function(){console.log("wysylanie danych");});
}