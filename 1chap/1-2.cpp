// 1-2
// 文字列A,Bがあって片方がもう片方の並び替えになっているか調べるメソッド
#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
using namespace std;

int rotate_same_str(string a, string b){
  int boolean = 0;
  if (a.length() != b.length()){
    boolean =  0;
  }
  for(int i = 0; i < b.length(); i++){
    char first;
    first = b.front();
    b.push_back(first);
    string brotate;
    b.erase(b.begin());
    brotate = b;
    if(brotate != a){
      boolean = 0;
    }
    else{
      boolean = 1;
    }
  }
  return boolean;
}

int main(){
  string a;
  string b;
  a = "abc";
  b = "acb";

  if(rotate_same_str(a, b) == 1){
    cout << "same" << endl;
  } else {
    cout << "Not same" << endl;
  }

  return 0;
}