// get value
var viewer = document.getElementById("result");
var result = viewer.textContent;
function getvalue(value) {
    result += value;
    viewer.innerHTML = result; // Display current number
};

function Calculate(){
    viewer.innerHTML = "";// Display current number
    viewer.innerHTML = eval(result);
}