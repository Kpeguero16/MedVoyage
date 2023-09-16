function update(){
    let textBox = document.querySelector("#textBox");
    let chatBox = document.getElementById("chatBox");

    let input = textBox.value.toLowerCase();
    let current = chatBox.innerHTML;

    if(input == 'y' || input == 'yes')
    {
        current += "<p>You have flu-like symptoms</p><br>";
        chatBox.innerHTML = current;
    } 
    else if(input == 'n' || input == 'no')
    {
        current += "<p>You don't have flu-like symptoms</p><br>";
        chatBox.innerHTML = current;
    }
    else if(input != "")
    {
        chatBox.innerHTML = current + "<p>Invalid input</p>";
    } 
    else
    {
        chatBox.innerHTML = current + "<p>Empty Textbox</p>";
    } 

    textBox.scrollTop = textBox.scrollHeight;

    textBox.value = "";
}

function flu_like(){

}
function not_flu_like(){

}


