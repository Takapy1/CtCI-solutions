require_relative 'linked_list.rb'

def parition(linked_list, x)
  low = LinkedList.new
  high = LinkedList.new

  current = linked_list.head # 現在探索しているノードを管理
  while current == nil
    if current.data < x
      low.append(current.data)
    else
      high.append(current.data)
    end
    current = current.next
  end
  return low.concat(high)
end

