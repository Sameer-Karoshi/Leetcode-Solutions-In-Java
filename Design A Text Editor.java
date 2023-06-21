class TextEditor {
    StringBuilder sb;
    int position;
    public TextEditor() {
        sb = new StringBuilder();
        position = 0;
    }
    
    public void addText(String text) {
        sb.insert(position, text);
        position += text.length();
    }
    
    public int deleteText(int k) {
        int temp = position;
        position -= k;
        if(position < 0) {
            position = 0;
        }
        sb.delete(position,temp);
        return temp-position;
    }
    
    public String cursorLeft(int k) {
        position -= k;
        if (position < 0) {
            position = 0;
        }
        if(position < 10) return sb.substring(0,position);
        return sb.substring(position-10,position);
    }
    
    public String cursorRight(int k) {
        position += k;
        if (position > sb.length()) {
            position = sb.length();
        }
        if(position < 10) return sb.substring(0,position);
        return sb.substring(position-10,position);
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */