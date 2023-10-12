function reverseWordsInSentence(sentence) {
    return sentence.split(/\s+/).map(word => word.split('').reverse().join('')).join(' ');
}

const input = "This is a sunny day";
const output = reverseWordsInSentence(input);
console.log(output);
