-- Table: public.UserNeeds

-- DROP TABLE public."UserNeeds";

CREATE TABLE public."UserNeeds"
(
    "ID" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "USER_ID" integer NOT NULL,
    "PRODUCT_KEY" character(30) COLLATE pg_catalog."default" NOT NULL,
    "NEED_PRICE" integer NOT NULL,
    "PRODUCT_NAME" character(50) COLLATE pg_catalog."default" NOT NULL,
    "LINK" character(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "UserNeeds_pkey" PRIMARY KEY ("ID")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."UserNeeds"
    OWNER to postgres;