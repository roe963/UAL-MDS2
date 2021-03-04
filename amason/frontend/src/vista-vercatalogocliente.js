import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vercatalogocliente`
 *
 * VistaVercatalogocliente element.
 *
 * @customElement
 * @polymer
 */
class VistaVercatalogocliente extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-vercatalogoadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercatalogocliente.is, VistaVercatalogocliente);
