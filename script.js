const diagnosisTree = {
    question: " Have you been experiencing flu-like symptoms? ",
    yes: {
        question: " Have you been experiencing hallucinations? ",
        yes: {
            question: " Does your throat burn when you drink water? ",
            yes: {
                result: "You may have Rabies"
            },
            no: {
                result: "Seek medical help"
            }
        },
        no: {
            question: " Have you experienced one or more swollen, painful lymph nodes? ",
            yes: {
                result: "You may have the Plague"
            },
            no: {
                question: " Have you experienced any gastrointestinal issues? ",
                yes: {
                    question: " Any unexplanied bleeding or bruising? ",
                    yes: {
                        result: "You may have Ebola"
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

