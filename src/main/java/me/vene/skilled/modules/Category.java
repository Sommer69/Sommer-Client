package me.vene.skilled.modules;

import me.vene.skilled.utilities.*;

public enum Category
{
    G(StringRegistry.register(""), 7), 
    C(StringRegistry.register(new String(new char[] { 'C', 'o', 'm', 'b', 'a', 't' })), 0), 
    O(StringRegistry.register(new String(new char[] { 'O', 't', 'h', 'e', 'r' })), 2), 
    P(StringRegistry.register("Spiller"), 3), 
    R(StringRegistry.register("Visuelle ting"), 4), 
    U(StringRegistry.register("Smarte ting"), 5), 
    CO(StringRegistry.register("Kommandoer"), 8), 
    A(StringRegistry.register(new String(new char[] { 'T', 'e', 'x', 't', ' ', 'G', 'U', 'I' })), 1), 
    I(StringRegistry.register("Advarsler"), 6), 
    F(StringRegistry.register("Venner"), 9);
    
    private String name;
    private int id;
    
    private Category(final String name, final int id) {
        this.name = StringRegistry.register(name);
        this.id = id;
    }
    
    public String getName() {
        return StringRegistry.register(this.name);
    }
    
    public void setName(final String newName) {
        this.name = newName;
    }
    
    public int getID() {
        return this.id;
    }
}
