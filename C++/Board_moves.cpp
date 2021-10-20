//https://codeforces.com/problemset/problem/1353/C

#include<iostream>

using namespace std;

int main()
{
    int t;
    cin>>t;
    for(int j=0;j<t;j++)
    {
        int n;
        cin>>n;
        long long int sum = 0;
    
        for(int i=0;i<=n/2;i++)
        {
            sum += 8*i*i;
            
        }
        cout<<sum<<endl;
    }
    return 0;
}
