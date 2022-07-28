package com.wonit.persistence.util.converter;

import com.wonit.core.user.Infos;
import com.wonit.persistence.util.serializer.Serializer;
import org.postgresql.util.PGobject;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class InfoReadingConverter implements Converter<PGobject, Infos> {
    @Override
    public Infos convert(PGobject source) {
        String value = source.getValue();
        return Serializer.getInstance().deserialize(value, Infos.class);
    }
}
