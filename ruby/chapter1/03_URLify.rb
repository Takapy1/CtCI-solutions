def urlify(str, _size)
  str.rstrip!
  str.gsub(/\s/, "%20")
end

p urlify("Mr John Smith ", 13)
