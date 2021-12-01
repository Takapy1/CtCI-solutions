/* 
  argument: num of step of stairs
  return value: num_of_pattern
 */
#include <bits/stdc++.h>
using namespace std;
#define rep(i,n) for (int i = 0; i < n; i++)

int go_up_pattern (int n) {
  int pattern;
  vector<int> dp(n+1);
  dp[0] = 0;
  rep(i, n) {
    if  (n <= 3) dp[i+1] = dp[i] + n;
    else dp[i+1] = dp[i] + 3;
  }
  return pattern;
}

int main() {
  
}