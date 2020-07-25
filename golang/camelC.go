package kata

import(
  "strings"
  "unicode"
)

func ToCamelCase(s string) string {

	runeArr := []rune(s)
  var isTrue bool

  if strings.Contains(s, "-"){
    s = strings.ReplaceAll(s, "-", " ")
    isTrue = unicode.IsUpper(runeArr[0])
  } else if strings.Contains(s, "_"){
    s = strings.ReplaceAll(s, "_", " ")
    isTrue = unicode.IsUpper(runeArr[0])
  } else {
    s = s
    isTrue = true
  }

  if s != " "{
  s = strings.Title(s)
  s = strings.ReplaceAll(s, " ", "")
}

  if isTrue != true {
    newStr := s[1:]
    newRChar := unicode.ToLower(runeArr[0])
    newChar := string(newRChar)
    s = newChar + newStr
  }
  return s
}
