const diagnosisTree = {
    question: " Have you been experiencing flu-like symptoms? ",
    yes: {
        question: " Have you been experiencing hallucinations? ",
        yes: {
            question: " Does your throat burn when you drink water? ",
            yes: {
                result: "You may have Rabies."
            },
            no: {
                result: "Seek medical help."
            }
        },
        no: {
            question: " Have you experienced one or more swollen, painful lymph nodes? ",
            yes: {
                result: "You may have the Plague."
            },
            no: {
                question: " Have you experienced any gastrointestinal issues? ",
                yes: {
                    question: " Any unexplanied bleeding or bruising? ",
                    yes: {
                        result: "You may have Ebola."
                    },
                    no: {
                        result: "Seek medical help."
                    }
                },
                no: {
                    result: "Seek medical help."
                }
            }
        }
    },
    no: {
        question: " Have you experienced any gastrointestinal issues? ",
        yes: {
            question: " Have you consumed Dairy in the last 12 hours? ",
            yes: {
                result: "You may be Lactose Intolerant."
            },
            no: {
                questions: " Have you consumed Grain products recently? ",
                yes: {
                    result: " You may have Celiac Disease. "
                },
                no: {
                    result: " You may have a stomach bug. "
                }
            }
        }, 
        no: {
            question: " Have you experienced any chest pain? ",
            yes: {
                question: " Have you experienced acid reflux? ",
                yes: {
                    result: " You may have GERD. "
                },
                no: {
                    result: " Seek medical help. "
                }
            },
            no: {
                question: " Have you experienced any shortness of breath? ",
                yes: {
                    result: " You may have Angina. "
                },
                no: {
                    result: " Seek medical help"
                }
            }
        }
    }
};


let currentNode = diagnosisTree;
const textBox = document.getElementById("chatBox");

function reset()
{
    currentNode = diagnosisTree;
    textBox.innerHTML = "<p> Have you been experiencing flu-like symptoms? </p>"
}
    

function update(answer) {
    
    currentNode = currentNode[answer];
    if (currentNode.question) {

        textBox.innerHTML = "<p>"+currentNode.question+"</p>"

    } else {
        textBox.innerHTML = "<p>"  + currentNode.result + "</p>" 
    }
}

textBox.innerHTML = "<p>" + currentNode.question + "</p>";

