def disemvowel(string):
    vowels = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]
    strArr = list(string)
    count = 1

    while count <= 10:
        testChar = vowels[count - 1]
        print(testChar)
        if testChar in strArr:
            strArr = ['' if wd == testChar else wd for wd in strArr]
        count = count + 1

    emptySpace = ""

    string = emptySpace.join(strArr)

    return string
