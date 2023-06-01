package tests;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.ObjectMapper;
import semantikCheck.Program;

public class JsonConverter {
    public static String convertToJson(Program program){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
        return objectMapper.writeValueAsString(program);
    }catch(JacksonException je){
            System.out.println(je);
        }
        return "";
    }
}
