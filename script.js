const diagnosisTree = {
    question: " Are you experiencing flu-like symptoms? ",
    yes: {
        question: " Are you experiencing hallucinations? ",
        yes: {
            question: " Does your throat burn when you drink water? ",
            yes: {
                result: "Rabies"
            },
            no: {
                result: "Seek medical help"
            }
        },
        no: {
            question: " Do you inflated buboes? ",
            yes: {
                result: "Plague"
            },
            no: {
                question: " Do you have gastrointestinal issues? ",
                yes: {
                    question: " Bleeding? ",
                    yes: {
                        result: "Ebola"
                    },
                    no: {
                        result: "Seek medical help"
                    }
                },
                no: {
                    result: "Seek medical help"
                }
            }
        }
    },
    no: {
        result: "Seek medical help"
    }
};
    let currentNode = diagnosisTree;
    
    
    
    // const yesButton = document.getElementById("yes");
    // const noButton = document.getElementById("no");
    const textBox = document.getElementById("chatBox");
    
    


function update(answer) {
    
    currentNode = currentNode[answer];
    if (currentNode.question) {

        textBox.innerHTML += "<p>"+currentNode.question+"</p>"

    } else {
        textBox.innerHTML += "<p>"  + currentNode.result + "</p>"
        yesButton.style.display = "none";
        noButton.style.display = "none";
    }
}

textBox.innerHTML = "<p>" + currentNode.question + "</p>";

