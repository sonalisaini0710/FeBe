
function myFunction()
{
	var x = document.getElementById("dibba").value;
	console.log(x);
	fetch("http://localhost:8090/box", {
  method: "POST",
  body: JSON.stringify({
    text:x
  }),
  headers: {
    "Content-type": "application/json; charset=UTF-8"
  }
});
	document.getElementById("myForm").reset();
}