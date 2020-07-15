-- Table: public.USER

-- DROP TABLE public."USER";

CREATE TABLE public."USER"
(
    "ID" integer NOT NULL,
    "NAME" character(40) COLLATE pg_catalog."default",
    "EMAIL" character(40) COLLATE pg_catalog."default" NOT NULL,
    "PASSWORD" character(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "USER_pkey" PRIMARY KEY ("ID")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."USER"
    OWNER to postgres;