//https://codeforces.com/problemset/problem/1374/C

#include<iostream>
#include<string>
#include<vector>

using namespace std;

int main()
{
    vector<char> stk;
    int t=0;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        int nf=0;
        cin>>nf;
        string s;
        cin>>s;
        for(int j=0;j<s.length();j++)
        {
            stk.push_back(s[j]);
            if(stk.size()>1)
            {
                if(stk.back()==')' && stk.at(stk.size()-2)=='(')
                {
                    stk.pop_back();
                    stk.pop_back();
                }
            }
            else{
                continue;
            }
        }
        cout<<stk.size()/2<<endl;
        stk.clear();
    } 
    return 0;
}