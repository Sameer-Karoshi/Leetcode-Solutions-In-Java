class BrowserHistory {
    String[] browsehistory = new String[5000];
    // This is current page in browser
    int curindex = -1; 
    // The last page you visited (new entry added)
    int backindex = -1; 
    
    public BrowserHistory(String homepage) {
        visit(homepage); 
    }
    
    public void visit(String url) {
        curindex++;
        browsehistory[curindex] = url;
        backindex = curindex;
    }
    
    public String back(int steps) {
        curindex = Math.max(curindex - steps, 0);
        return browsehistory[curindex];
    }
    
    public String forward(int steps) {
        curindex = Math.min(curindex + steps, backindex);
        return browsehistory[curindex];
    }
    
}
