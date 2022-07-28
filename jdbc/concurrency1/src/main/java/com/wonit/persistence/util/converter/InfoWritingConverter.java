package com.wonit.persistence.util.converter;

import com.wonit.core.user.Infos;
import com.wonit.persistence.util.serializer.Serializer;
import java.sql.SQLException;
import org.postgresql.util.PGobject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class InfoWritingConverter implements Converter<Infos, PGobject> {
    @Override
    public PGobject convert(Infos source) {
        String json = Serializer.getInstance().serialize(source);

        PGobject jsonObject = new PGobject();
        jsonObject.setType("json");
        try {
            jsonObject.setValue(json);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
