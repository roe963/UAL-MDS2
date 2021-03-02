import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-marcarcomoentregado`
 *
 * VistaMarcarcomoentregado element.
 *
 * @customElement
 * @polymer
 */
class VistaMarcarcomoentregado extends PolymerElement {

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
        return 'vista-marcarcomoentregado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMarcarcomoentregado.is, VistaMarcarcomoentregado);
