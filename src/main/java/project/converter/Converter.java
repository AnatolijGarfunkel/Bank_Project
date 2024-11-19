package project.converter;

public interface Converter<Entity, ReequestDto, ResponseDto> {

    ResponseDto toDto(Entity entity);

    Entity toEntity(ReequestDto dto);
}
