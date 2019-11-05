/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function getData(){
    var data_api = window.location.origin + "/JEEL219/SFS";
    console.log(data_api);
    $.getJSON( data_api, function(){
        console.log("pobieram dane");
    })
    .done(function( data ) {
      console.log(data);
      $("#content").empty();
      $.each(data, function(key, value){
         var row = $("<tr>").appendTo("#content"); 
         $("<th>").append(value.name).appendTo(row);
         $("<th>").append(value.company.id.companyName).appendTo(row);
      });
      
    });
};


