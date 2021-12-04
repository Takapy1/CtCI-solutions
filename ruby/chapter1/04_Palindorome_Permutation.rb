def palindrome_permutaiton(str)
  str.gsub!(/\s/, "").downcase!
  char_list = str.chars.tally
  if str.size.even?
    num_odd = 0
    char_list.to_a.each do |_, val|
      val.even? ? num_even += 1 : num_odd += 1
    end
    num_odd == 0 ? true : false
  else
    num_odd = 0
    char_list.to_a.each do |_, val|
      val.even? ? num_even += 1 : num_odd += 1
    end
    num_odd == 1 ? true : false
  end
end

puts palindrome_permutaiton("Tact Coa")