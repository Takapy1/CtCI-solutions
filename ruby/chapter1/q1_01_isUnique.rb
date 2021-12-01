# def unique_str?(str)
#   puts str.uniq.size - str.size == 0 ? "Unique" : "Non Unique"
# end

def is_unique?(str) 
  str.each_char.with_object({}) do |char, hash_table|
    if hash_table[char]
      return false 
    else
      hash_table[char] = true
    end
  end
  true
end
