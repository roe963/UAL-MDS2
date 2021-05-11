import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import './vista-ofertas.js';
import './vista-productos.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaCliente extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: stretch;" id="vista-cliente">
 <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl);" id="vl_ofertas">
  <h4 id="tittle-ofertas">Ofertas</h4>
  <vaadin-horizontal-layout theme="spacing" id="hlofertas" style="width: 100%;">
   <vista-ofertas style="width: 100%; height: 100%;" id="lista-ofertas"></vista-ofertas>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 0; flex-shrink: 1; flex-basis: auto; padding: var(--lumo-space-xl); align-self: stretch;" id="layout-topventas">
  <h4 id="tittle-topventas">Top ventas</h4>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-select value="Item one" id="select-categoria">
    <template>
     <vaadin-list-box selected="0">
      <vaadin-item selected>
        Categoría 
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
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
   <vista-productos style="align-self: stretch; flex-grow: 1;"></vista-productos>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCliente.is, VistaCliente);
