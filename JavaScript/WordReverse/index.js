let btn = document.getElementById("btn");
let inputTxt = document.getElementById("inputText");
let reverseTxt = document.getElementById("outputText");

function reverse(str) {
    let arr = str.split(" ");
    let j = 0;
    // console.log(arr[0]);
    let output = "";

    while(j<arr.length){
        let st =arr[j];
        for (let i = st.length - 1; i >= 0; i--) {
            output += st[i];
        }
        output+=" ";
        j++;
    }
    return output;
}

function handleClick() {
    let text = inputTxt.value;
    let reversedText = reverse(text);
    reverseTxt.innerText = reversedText;
    inputTxt.value = "";

}

btn.addEventListener("click", handleClick)