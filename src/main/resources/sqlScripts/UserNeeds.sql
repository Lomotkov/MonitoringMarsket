-- Table: public.UserNeeds

DROP TABLE public."UserNeeds";

CREATE TABLE public."UserNeeds"
(
	"ID" integer NOT NULL GENERATED ALWAYS AS IDENTITY,
    "USER_ID" integer NOT NULL,
    "PRODUCT_KEY" character(30) COLLATE pg_catalog."default" NOT NULL,
    "NEED_PRICE" integer NOT NULL,
	 CONSTRAINT "UserNeeds_pkey" PRIMARY KEY ("ID"),
   CONSTRAINT "fk_USER"
   FOREIGN KEY("USER_ID")
  REFERENCES public."USER"("ID")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."UserNeeds"
    OWNER to postgres;