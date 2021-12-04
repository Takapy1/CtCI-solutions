# 各ノードは次の値を知っている
Node = Struct.new(:data, :next)

# LinkedListはheadの値から参照していくだけで、配列のようにindex指定して参照することがないので、
# 全体を管理する配列は必要ない!!!(各ノードが次へのポインタを持っていればいい)
class LinkedList
  def initialize(values=[]) #単方向連結リストに入れたいデータの配列を受け取る
    @head = values.empty? ? Node.new(nil, nil) : Node.new(values.first, nil)
    @tail = @head #末尾のノード (new node 追加時に使用する)
    @length = 1 #初期化の時点では1
    values[1..-1].each { |v| append(v) } if values.length > 1 #headのときにvalues[0]は作成済みなので、1~-1になる
  end

  def append(value)
    if @tail.data
      @tail.next = Node.new(value, nil)
      @length += 1
    else
      @tail.data = value
    end
    @tail = @tail.next if @tail.next
  end

end



# track fileのこと



# # def main(argv)
#   # このコードは引数と標準出力を用いたサンプルコードです。
#   # このコードは好きなように編集・削除してもらって構いません。
#   # ---
#   # This is a sample code to use arguments and outputs.
#   # Edit and remove this code as you like.

#   argv.each_index do |i|
#     v = argv[i]
#     puts "argv[#{i}]: #{v}"
#   end
# end

# main(ARGV)