class Bentukwajah{
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
}
 
class Senyum extends Bentukwajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends Bentukwajah{
    public String respons(){
        return("Tertawa karena gembira");
    }
}

class Marah extends Bentukwajah{
    public String respons(){
        return("Kemarahan disebebkan bertengkar\n");
    }
}

class Sedih extends Bentukwajah{
    public String respons(){
        return("Sedih disebabkan cemburu\n");
    }
}
