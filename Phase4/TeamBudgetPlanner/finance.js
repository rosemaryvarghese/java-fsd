class Deal {
    constructor(dealId, client_name, project_name, project_manager, project_cost) {
        this.dealId = dealId;
        this.client_name = client_name;
        this.project_name = project_name
        this.project_manager = project_manager
        this.project_cost = project_cost
    }
}
function CreateTableFromJSON() {
    $("tbody").empty()
    var Data = JSON.parse(localStorage.getItem("myData"));

    $.each(Data, function (key, value) {
        $('tbody').append(`<tr>
    <td class ="dealId" >${value.dealId}</td>
    <td class ="client_name">${value.client_name}</td>
    <td class ="project_name">${value.project_name}</td>
    <td class ="project_manager">${value.project_manager}</td>
    <td ><input type="text" class ="project_cost" value= "${value.project_cost}"></td>
  </tr>`);
    })

}
function UpdateCost(){
    var ary = [];
    $(function () {
        $('.update tr').each(function (a, b) {
            var dealId = $('.dealId',b).text();
            var clientName =$('.client_name',b).text();
            var projectName =  $('.project_name',b).text();
            var projectManager =$('.project_manager',b).text();
            var projectCost =$('.project_cost',b).val();
           
            ary.push(new Deal(dealId,clientName,projectName,projectManager,projectCost));
           
        });
       
    });
    localStorage.clear();
    localStorage.setItem("myData", JSON.stringify(ary));
    console.log(JSON.stringify(ary));
    alert("cost updated")
    CreateTableFromJSON();
}