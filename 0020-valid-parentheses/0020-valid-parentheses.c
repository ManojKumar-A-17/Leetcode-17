bool isValid(char* s) {
    int l  = strlen(s);
    char st[l];
    int t=-1;
    for(int i=0;i<l;i++){
        if(s[i] == '(' || s[i] == '[' || s[i] == '{'){
            st[++t]=s[i];
        }
        else{
            if(t == -1)return false;
            char r = st[t--];
            if((s[i]== '}' && r!='{') || (s[i]== ']' && r!='[') || (s[i]== ')' && r!='(')){
                return false;
            }
        }
    }
    return t==-1;
}