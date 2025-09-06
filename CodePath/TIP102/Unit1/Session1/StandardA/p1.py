def reverse_sentence(sentence):
    reverse = ""
    for i in range(len(sentence.split())):
        reverse = sentence.split()[i] + " " + reverse
    print(reverse)

sentence = "tubby little cubby all stuffed with fluff"
reverse_sentence(sentence)

sentence = "Pooh"
reverse_sentence(sentence)

