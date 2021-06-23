import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaAdministrarproductos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 50%; height: 100%; margin-right: var(--lumo-space-m); margin-left: var(--lumo-space-xl); align-items: stretch;">
  <vaadin-text-field label="Nombre" id="textFlield-nombre"></vaadin-text-field>
  <vaadin-vertical-layout theme="spacing" style="align-items: stretch;">
   <vaadin-select value="Item one" id="select-categoria">
    <template>
     <vaadin-list-box>
      <vaadin-item selected>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
  </vaadin-vertical-layout>
  <vaadin-text-field label="Precio" id="textFlield-precio"></vaadin-text-field>
  <vaadin-text-area label="Descripción" id="descripción" dir="textArea-descripcion"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; flex-direction: row; width: 100%;">
   <vaadin-text-field label="Imagen 1" id="textFlield-imagen1" style="flex-grow: 0; width: 18%;"></vaadin-text-field>
   <vaadin-text-field label="Imagen 2" id="textFlield-imagen2" style="flex-grow: 0; width: 18%;"></vaadin-text-field>
   <vaadin-text-field label="Imagen 3" id="textFlield-imagen3" style="width: 18%;"></vaadin-text-field>
   <vaadin-text-field label="Imagen 4" id="textFlield-imagen4" style="width: 18%;"></vaadin-text-field>
   <vaadin-text-field label="Imagen 5" id="textFlield-imagen5" style="flex-grow: 1; flex-shrink: 1; width: 18%;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center;">
   <vaadin-radio-group value="foo" id="radioGroup-imagen">
    <vaadin-radio-button name="foo" id="radioButton-Imagen1" checked>
     Imágen 1
    </vaadin-radio-button>
    <vaadin-radio-button name="foo" id="radioButton-Imagen2">
     Imágen 2
    </vaadin-radio-button>
    <vaadin-radio-button name="foo" id="radioButton-Imagen3">
     Imágen 3
    </vaadin-radio-button>
    <vaadin-radio-button name="foo" id="radioButton-Imagen4">
     Imágen 4
    </vaadin-radio-button>
    <vaadin-radio-button name="foo" id="radioButton-Imagen5">
     Imágen 5
    </vaadin-radio-button>
   </vaadin-radio-group>
  </vaadin-vertical-layout>
  <vaadin-button id="button-anadir">
   Añadir
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 1; margin-left: var(--lumo-space-m); margin-right: var(--lumo-space-xl); align-items: stretch;">
  <vaadin-text-field label="Buscar" id="textFlield-buscar"></vaadin-text-field>Productos Activos/Desactivos
  <vaadin-horizontal-layout theme="spacing" id="layout-productos" style="align-items: stretch;"></vaadin-horizontal-layout>
  <vaadin-button id="button-guardar">
   Guardar
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarproductos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarproductos.is, VistaAdministrarproductos);
