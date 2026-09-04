package io.jmix.core.impl.serialization;

import com.google.common.base.Strings;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.smartbox.jobster.$;
import com.smartbox.jobster.AppBeans;
import com.smartbox.jobster.entity.ai.AIServiceLog;
import com.smartbox.jobster.entity.ats.MessageHistory;
import com.smartbox.jobster.entity.ats.Platform;
import com.smartbox.jobster.entity.ats.Priority;
import com.smartbox.jobster.entity.core.PersonDocument;
import com.smartbox.jobster.entity.questionnaire.QuestionAnswer;
import com.smartbox.jobster.entity.questionnaire.QuestionBotType;
import com.smartbox.jobster.entity.tg.FileType;
import com.smartbox.jobster.pojo.ai.AbstractAIService;
import com.smartbox.jobster.pojo.ai.response.AbstractAIServiceResponse;
import com.smartbox.jobster.pojo.ai.response.SpeechAssessmentResponse;
import com.smartbox.jobster.service.SpeechAssessmentService;
import io.jmix.core.*;
import io.jmix.core.accesscontext.ExportImportEntityContext;
import io.jmix.core.annotation.Secret;
import io.jmix.core.entity.EntityValues;
import io.jmix.core.impl.serialization.serializers.EnumSerializer;
import io.jmix.core.impl.serialization.serializers.FileRefSerializer;
import io.jmix.core.impl.serialization.serializers.OffsetDateTimeSerializer;
import io.jmix.core.impl.serialization.serializers.PlatformSerializer;
import io.jmix.core.metamodel.datatype.Datatype;
import io.jmix.core.metamodel.datatype.DatatypeRegistry;
import io.jmix.core.metamodel.datatype.EnumClass;
import io.jmix.core.metamodel.model.MetaClass;
import io.jmix.core.metamodel.model.MetaProperty;
import io.jmix.core.metamodel.model.MetaPropertyPath;
import io.jmix.core.metamodel.model.Range;
import jakarta.validation.constraints.NotNull;
import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.function.Function;

@Component("core_EntitySerialization")
public class EntitySerializationImpl implements EntitySerialization {

    private static final Logger log = LoggerFactory.getLogger(EntitySerializationImpl.class);

    @Autowired
    protected MetadataTools metadataTools;

    @Autowired
    protected Metadata metadata;

    @Autowired
    protected AccessManager accessManager;

    @Autowired
    protected EntityStates entityStates;

    @Autowired
    protected DatatypeRegistry datatypeRegistry;

    @Autowired
    protected EntitySerializationTokenManager tokenManager;

    @Autowired
    protected CoreProperties coreProperties;

    @Autowired
    protected EntityAttributeSerializationExtensionResolver extensionResolver;

    protected ThreadLocal<EntitySerializationContext> context =
            ThreadLocal.withInitial(EntitySerializationContext::new);

    /**
     * Class is used for storing a collection of entities already processed during the serialization.
     */
    protected static class EntitySerializationContext {
        protected Table<Object, MetaClass, Object> processedEntities = HashBasedTable.create();

        protected Table<Object, MetaClass, Object> getProcessedEntities() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    @Override
    public String toJson(Object entity) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String toJson(Object entity,
                         @Nullable FetchPlan fetchPlan,
                         EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String toJson(Collection<?> entities) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String toJson(Collection<?> entities,
                         @Nullable FetchPlan fetchPlan,
                         EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public String objectToJson(Object object, EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T entityFromJson(String json,
                                @Nullable MetaClass metaClass,
                                EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public <T> Collection<T> entitiesCollectionFromJson(String json,
                                                        @Nullable MetaClass metaClass,
                                                        EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Override
    public <T> T objectFromJson(String json, Type type, EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Gson createGsonForSerialization(@Nullable FetchPlan fetchPlan, EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected Gson createGsonForDeserialization(@Nullable MetaClass metaClass, EntitySerializationOption... options) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Nullable
    protected Field getField(@Nullable Class clazz, String fieldName) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected void makeFieldAccessible(Field field) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    protected class EntitySerializer implements JsonSerializer<Entity> {

        protected boolean compactRepeatedEntities = false;
        protected boolean serializeInstanceName;
        protected boolean doNotSerializeReadOnlyProperties = false;
        protected boolean doNotSerializeDeniedProperties = false;
        protected boolean serializeSecretFields = false;
        protected FetchPlan fetchPlan;


        protected void writeFields(Entity entity, JsonObject jsonObject, @Nullable FetchPlan fetchPlan, Set<Entity> cyclicReferences) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        public EntitySerializer(@Nullable FetchPlan fetchPlan, EntitySerializationOption... options) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public JsonElement serialize(Entity entity, Type typeOfSrc, JsonSerializationContext context) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected JsonObject serializeEntity(Entity entity, @Nullable FetchPlan fetchPlan, Set<Entity> cyclicReferences) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected void writeIdField(Entity entity, JsonObject jsonObject) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected boolean propertyWritingAllowed(MetaProperty metaProperty, Entity entity, ExportImportEntityContext exportImportContext) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected void writeSimpleProperty(JsonObject jsonObject, @NotNull Object fieldValue, MetaProperty property) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        /**
         * Renders a Map-valued datatype property as a JSON object. A null VALUE is emitted as JSON
         * null rather than skipped: {@code $.map2settings} stores it as the literal {@code <NULL>} and
         * {@code $.settings2map} reads it back as null, so the key is meaningful and dropping it would
         * silently lose data on a REST round trip. Keys are stringified — these maps are declared
         * {@code Map<String, String>}, so this only guards against a raw Map slipping through.
         */
        protected JsonObject serializeSimpleMap(Map<?, ?> fieldValue) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected JsonArray serializeCollection(Collection value, @Nullable FetchPlan fetchPlan, Set<Entity> cyclicReferences) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected JsonArray serializeSimpleCollection(Collection fieldValue, MetaProperty property) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    protected class EntityDeserializer implements JsonDeserializer<Entity> {

        protected MetaClass metaClass;

        public EntityDeserializer(@Nullable MetaClass metaClass, EntitySerializationOption... options) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public Entity deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected Object readEntity(JsonObject jsonObject, @Nullable MetaClass metaClass) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected boolean propertyReadRequired(String propertyName) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected void readFields(JsonObject jsonObject, Object entity) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Nullable
        protected Object readSimpleProperty(JsonElement valueElement, Datatype propertyType) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected Object readEmbeddedEntity(JsonObject jsonObject, MetaProperty metaProperty) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected Collection readCollection(JsonArray jsonArray, MetaProperty metaProperty) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected Collection readSimpleCollection(JsonArray jsonArray, MetaProperty metaProperty) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        /**
         * Counterpart of {@link EntitySerializer#serializeSimpleMap(Map)}. Returns a LinkedHashMap so
         * key order survives the round trip — {@code $.map2settings} joins entries in iteration order.
         * A JSON null becomes a null value (stored as {@code <NULL>}), not a dropped key. Anything that
         * is not a JSON object yields an empty map rather than an exception: these properties are
         * optional settings blobs, and a malformed one must not turn a REST write into a 500.
         */
        protected Map<String, String> readSimpleMap(JsonElement propertyValue) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        protected void clearFields(Object entity) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        /*protected void fetchDynamicAttributes(Entity entity) {
            if (entity instanceof BaseGenericIdEntity) {
                LoadContext<BaseGenericIdEntity> loadContext = new LoadContext<>(metadata.getClass(entity));
                loadContext.setId(entity.getId()).setLoadDynamicAttributes(true);
                DataManager dataService = AppBeans.get(DataManager.NAME, DataManager.class);
                BaseGenericIdEntity reloaded = dataService.load(loadContext);
                if (reloaded != null) {
                    ((BaseGenericIdEntity) entity).setDynamicAttributes(reloaded.getDynamicAttributes());
                } else {
                    ((BaseGenericIdEntity) entity).setDynamicAttributes(new HashMap<>());
                }
            }
        }*/
    }

    protected class DateSerializer implements JsonSerializer<Date> {

        private final Datatype<Date> dateDatatype;

        public DateSerializer() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

    protected class DateDeserializer implements JsonDeserializer<Date> {

        private final Datatype<Date> dateDatatype;

        public DateDeserializer() {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }

        @Override
        public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            // Реализация не публикуется: коммерческая тайна.
            throw new UnsupportedOperationException("Implementation not published");
        }
    }

//    protected boolean isCollectionDynamicAttribute(MetaProperty metaProperty) {
//        if (DynamicAttributesUtils.isDynamicAttribute(metaProperty.getName())) {
//            CategoryAttribute attribute = DynamicAttributesUtils.getCategoryAttribute(metaProperty);
//            return attribute != null && BooleanUtils.isTrue(attribute.getIsCollection());
//        }
//        return false;
//    }
}
